--
-- File generated with SQLiteStudio v3.2.1 on Thu Mar 26 16:34:12 2020
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: Audit
DROP TABLE IF EXISTS Audit;

CREATE TABLE Audit (
    audit_id INTEGER       PRIMARY KEY
                           NOT NULL,
    emp_id   VARCHAR (250),
    date     VARCHAR       DEFAULT (NULL),
    status   VARCHAR
);

INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (40, '9', '22:33:52 / Mar 24, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (41, 'lolo', '23:00:00 / Mar 24, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (42, 'lolo', '23:01:01 / Mar 24, 2020', 'Logged out');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (43, 'lolo', '23:01:43 / Mar 24, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (44, 'lolo', '23:01:56 / Mar 24, 2020', 'Logged out');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (45, 'lolo', '23:02:19 / Mar 24, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (46, 'lolo', '23:02:56 / Mar 24, 2020', 'Logged out');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (47, 'null', '15:53:11 / Mar 25, 2020', 'Logged out');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (48, 'lolo', '16:49:16 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (49, 'Genik', '18:51:55 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (50, 'Genik', '18:54:04 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (51, 'Genik', '18:57:09 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (52, 'Genik', '18:57:52 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (53, 'Genik', '19:16:53 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (54, 'Genik', '19:17:56 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (55, 'Genik', '19:20:43 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (56, 'Genik', '19:21:37 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (57, 'Genik', '19:25:49 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (58, 'Genik', '19:28:22 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (59, 'Genik', '19:33:39 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (60, 'Genik', '19:39:29 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (61, 'Genik', '19:44:27 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (62, 'Genik', '19:46:34 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (63, 'Genik', '20:13:59 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (64, 'Genik', '20:36:00 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (65, 'Genik', '20:36:53 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (66, 'Genik', '20:38:10 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (67, 'Genik', '20:38:46 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (68, 'Genik', '20:41:12 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (69, 'Genik', '20:53:19 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (70, 'Genik', '20:59:46 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (71, 'Genik', '21:06:24 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (72, 'Genik', '21:07:36 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (73, 'Genik', '21:11:39 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (74, 'Genik', '21:12:23 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (75, 'Genik', '21:15:05 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (76, 'Genik', '21:16:10 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (77, 'Genik', '21:19:24 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (78, 'Genik', '21:30:41 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (79, 'Genik', '21:31:47 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (80, 'Genik', '21:32:25 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (81, 'Genik', '21:34:12 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (82, 'Genik', '21:34:58 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (83, 'Genik', '21:43:38 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (84, 'Genik', '21:47:58 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (85, 'Genik', '21:58:45 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (86, 'Genik', '22:03:16 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (87, 'Genik', '22:14:40 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (88, 'Genik', '22:56:53 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (89, 'Genik', '23:50:49 / Mar 25, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (90, 'Genik', '08:38:30 / Mar 26, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (91, '', '09:21:22 / Mar 26, 2020', 'Updated Record');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (92, '', '09:22:00 / Mar 26, 2020', 'Updated Record');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (93, 'Genik', '12:07:56 / Mar 26, 2020', 'Logged in');
INSERT INTO Audit (audit_id, emp_id, date, status) VALUES (94, 'Genik', '15:29:52 / Mar 26, 2020', 'Logged in');

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
