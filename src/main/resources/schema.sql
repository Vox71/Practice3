CREATE TABLE public.db_client (
                                  id varchar(255) NOT NULL,
                                  birth_date date NULL,
                                  inn varchar(255) NULL,
                                  name varchar(255) NULL,
                                  passport_serial varchar(255) NULL,
                                  patronymic varchar(255) NULL,
                                  phone varchar(255) NULL,
                                  sex bool NULL,
                                  surname varchar(255) NULL,
                                  CONSTRAINT cw6_client_pkey PRIMARY KEY (id)
);

CREATE TABLE public.db_office (
                                  id varchar(255) NOT NULL,
                                  address varchar(255) NULL,
                                  cabinets_count int4 NULL,
                                  law_address varchar(255) NULL,
                                  name varchar(255) NULL,
                                  CONSTRAINT cw6_office_pkey PRIMARY KEY (id)
);


CREATE TABLE public.db_position (
                                    id varchar(255) NOT NULL,
                                    name varchar(255) NULL,
                                    salary int4 NULL,
                                    CONSTRAINT cw6_position_pkey PRIMARY KEY (id)
);

CREATE TABLE public.db_stuff (
                                 id varchar(255) NOT NULL,
                                 birth_date date NULL,
                                 name varchar(255) NULL,
                                 patronymic varchar(255) NULL,
                                 salary_multiplier float8 NULL,
                                 sex bool NULL,
                                 surname varchar(255) NULL,
                                 position_id varchar(255) NOT NULL,
                                 CONSTRAINT cw6_stuff_pkey PRIMARY KEY (id)
);
ALTER TABLE public.db_stuff ADD CONSTRAINT fka7n3xtcu5ndh4mdbd620qo37o FOREIGN KEY (position_id) REFERENCES public.db_position(id);

CREATE TABLE public.db_offer (
                                 id varchar(255) NOT NULL,
                                 ending_date DATE NULL,
                                 serial_number varchar(255) NULL,
                                 sign_date DATE NULL,
                                 start_date DATE NULL,
                                 client_id varchar(255) NOT NULL,
                                 office_id varchar(255) NOT NULL,
                                 stuff_id varchar(255) NOT NULL,
                                 CONSTRAINT cw6_offer_pkey PRIMARY KEY (id)
);

ALTER TABLE public.db_offer ADD CONSTRAINT fk3lxcsuyqy7179vvjhpdkcqaq8 FOREIGN KEY (office_id) REFERENCES public.db_office(id);
ALTER TABLE public.db_offer ADD CONSTRAINT fkau05e5en34p6wka1x606w7bsf FOREIGN KEY (stuff_id) REFERENCES public.db_stuff(id);
ALTER TABLE public.db_offer ADD CONSTRAINT fkreo9uevxgoef2sqpy2vk476l1 FOREIGN KEY (client_id) REFERENCES public.db_client(id);
