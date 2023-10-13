ALTER TABLE customer
ALTER COLUMN status TYPE smallint
USING status::smallint;
