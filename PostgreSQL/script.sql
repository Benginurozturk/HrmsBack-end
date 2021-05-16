BEGIN;


CREATE TABLE public.activation_codes
(
    id integer NOT NULL,
    is_confirmed boolean NOT NULL,
    confirmed_date date NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.activation_codes_candidates
(
    id integer NOT NULL,
    candidates_id integer NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.activation_codes_employers
(
    id integer NOT NULL,
    employer_id integer NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.candidates
(
    user_id integer NOT NULL,
    first_name character varying(50) NOT NULL,
    last_name character varying(50) NOT NULL,
    identity_number character varying(11) NOT NULL,
    birth_date date NOT NULL,
    PRIMARY KEY (user_id)
);

CREATE TABLE public.employees
(
    user_id integer NOT NULL,
    first_name character varying(50) NOT NULL,
    last_name character varying(50) NOT NULL,
    PRIMARY KEY (user_id)
);

CREATE TABLE public.employers
(
    user_id integer NOT NULL,
    company_name character varying(50) NOT NULL,
    phone_number character varying(13) NOT NULL,
    web_address character varying(50) NOT NULL,
    PRIMARY KEY (user_id)
);

CREATE TABLE public.employers_activation_employess
(
    id integer NOT NULL,
    employer_id integer NOT NULL,
    confirmed_employee_id integer NOT NULL,
    is_confirmed boolean NOT NULL,
    confirmed_date date NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.job_titles
(
    id integer NOT NULL,
    job_title character varying(50) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.users
(
    id integer NOT NULL,
    email character varying(50) NOT NULL,
    password character varying(30) NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE public.activation_codes
    ADD FOREIGN KEY (id)
    REFERENCES public.activation_codes_employers (id)
    NOT VALID;


ALTER TABLE public.activation_codes
    ADD FOREIGN KEY (id)
    REFERENCES public.activation_codes_candidates (id)
    NOT VALID;


ALTER TABLE public.activation_codes_candidates
    ADD FOREIGN KEY (candidates_id)
    REFERENCES public.candidates (user_id)
    NOT VALID;


ALTER TABLE public.activation_codes_employers
    ADD FOREIGN KEY (employer_id)
    REFERENCES public.employers (user_id)
    NOT VALID;


ALTER TABLE public.candidates
    ADD FOREIGN KEY (user_id)
    REFERENCES public.users (id)
    NOT VALID;


ALTER TABLE public.employees
    ADD FOREIGN KEY (user_id)
    REFERENCES public.users (id)
    NOT VALID;


ALTER TABLE public.employers
    ADD FOREIGN KEY (user_id)
    REFERENCES public.users (id)
    NOT VALID;


ALTER TABLE public.employers_activation_employess
    ADD FOREIGN KEY (confirmed_employee_id)
    REFERENCES public.employees (user_id)
    NOT VALID;


ALTER TABLE public.employers_activation_employess
    ADD FOREIGN KEY (employer_id)
    REFERENCES public.employers (user_id)
    NOT VALID;

END;
