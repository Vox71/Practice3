INSERT INTO public.db_client
(id, birth_date, inn, name, passport_serial, patronymic, phone, sex, surname)
VALUES
    ('593e767d-4adc-4b8f-af53-4cda8eb0e357', now(), '123123', 'Jesus', '1337', 'Patronus1', '88005553535', true, 'Christ'),
    ('e07f6609-bdcd-4f97-86bc-961cf692803e', now(), '321321', 'Judah', '2600', 'Patronus2', '84957777777', false, 'Iskariot');

INSERT INTO public.db_office
(id, address, cabinets_count, law_address)
VALUES
    ('a68062fe-bac2-4408-af87-85ebd882d7a4', 'Addr1',322, 'Law1'),
    ('f0b9b8b5-629d-4415-8399-62dbd9a271f4', 'Addr2',117, 'Law2');

INSERT INTO public.db_position
(id, name, salary)
VALUES
    ('ab57869a-56a3-4bb1-a5ee-3a2bedb99d46', 'Pose1', 420000),
    ('bca290bb-d657-48b1-8d55-7b795ffc4038', 'Pose2', 320000);

INSERT INTO public.db_stuff
(id, birth_date, name, patronymic, salary_multiplier, sex, surname, position_id)
VALUES
    ('a1cea7ce-e9b3-44fb-934c-abc333de9577', now(), 'Name1', 'Patronymic1', 1.4, false, 'Surname1', 'ab57869a-56a3-4bb1-a5ee-3a2bedb99d46'),
    ('fba9151d-6c2c-4f50-a3ca-c5d56669263c', now(), 'Name2', 'Patronymic2', 1.5, true, 'Surname2', 'bca290bb-d657-48b1-8d55-7b795ffc4038');


INSERT INTO public.db_offer
(id, ending_date, serial_number, sign_date, start_date, client_id, office_id, stuff_id)
VALUES
    ('2254d388-e6cc-492a-9134-461909a399c0', now(), '123123', now(), now(), '593e767d-4adc-4b8f-af53-4cda8eb0e357', 'a68062fe-bac2-4408-af87-85ebd882d7a4', 'a1cea7ce-e9b3-44fb-934c-abc333de9577'),
    ('baeb3246-b1b1-454a-b8cb-5594a77bffb5', now(), '321321', now(), now(), 'e07f6609-bdcd-4f97-86bc-961cf692803e', 'f0b9b8b5-629d-4415-8399-62dbd9a271f4', 'fba9151d-6c2c-4f50-a3ca-c5d56669263c');