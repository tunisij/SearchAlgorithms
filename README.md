class com.umich.tunisij.algorithms.BreadthFirstSearchAlgorithm
Tue Jan 22 18:32:17 EST 2019

|    |    |    |    |    |    |    |    |    |    |    |
|----|----|----|----|----|----|----|----|----|----|----|
| 63 | 57 | 51 | 58 | 64 | 70 | 75 | 72 | 67 | 73 | 76 |
| 56 | 50 | 43 | 52 | 59 | 65 | 71 | 66 | 60 | 68 | 74 |
| 49 | 42 | 34 | 44 | ## | ## | ## | ## | 53 | 61 | 69 |
| 40 | 32 | 25 | 35 | ## | 1  | 4  | ## | 45 | 54 | 62 |
| 30 | 23 | 17 | ## | ## | 0  | 2  | ## | 36 | 46 | 55 |
| 22 | 16 | 11 | 7  | 5  | 3  | ## | ## | 27 | 37 | 47 |
| 31 | 24 | 18 | 12 | 8  | 6  | 9  | 14 | 20 | 28 | 38 |
| 41 | 33 | 26 | 19 | 13 | 10 | 15 | 21 | 29 | 39 | 48 |

Route taken: 0	3	6	9	14	20	27	36	45	53	60	67	73	76


class com.umich.tunisij.algorithms.DepthFirstSearchAlgorithm
Tue Jan 22 18:32:17 EST 2019

|    |    |    |    |    |    |    |    |    |    |    |
|----|----|----|----|----|----|----|----|----|----|----|
| 24 | 26 | 27 | 28 | 30 | 32 | 34 | 36 | 38 | 40 | 42 |
| 22 | 25 | 29 | 31 | 33 | 35 | 37 | 39 | 41 | 43 | [] |
| 20 | 23 | [] | [] | ## | ## | ## | ## | [] | [] | [] |
| 19 | 21 | [] | [] | ## | 1  | 4  | ## | [] | [] | [] |
| 17 | 15 | 12 | ## | ## | 0  | 2  | ## | [] | [] | [] |
| 14 | 11 | 9  | 7  | 5  | 3  | ## | ## | [] | [] | [] |
| 18 | 16 | 13 | 10 | 8  | 6  | [] | [] | [] | [] | [] |
| [] | [] | [] | [] | [] | [] | [] | [] | [] | [] | [] |

Route taken: 0	3	5	7	9	11	14	17	19	20	22	24	26	27	28	30	32	34	36	38	40	42


class com.umich.tunisij.algorithms.UniformCostSearchAlgorithm
Tue Jan 22 18:32:17 EST 2019

|    |    |    |    |    |    |    |    |    |    |    |
|----|----|----|----|----|----|----|----|----|----|----|
| 60 | 50 | 42 | 51 | 61 | 69 | 75 | 71 | 67 | 72 | 76 |
| 53 | 41 | 35 | 43 | 54 | 64 | 73 | 66 | 62 | 68 | 74 |
| 47 | 34 | 27 | 36 | ## | ## | ## | ## | 55 | 63 | 70 |
| 40 | 26 | 23 | 28 | ## | 1  | 4  | ## | 48 | 56 | 65 |
| 33 | 22 | 17 | ## | ## | 0  | 2  | ## | 38 | 49 | 59 |
| 24 | 16 | 11 | 7  | 5  | 3  | ## | ## | 30 | 39 | 52 |
| 37 | 25 | 18 | 12 | 8  | 6  | 9  | 14 | 20 | 31 | 45 |
| 57 | 44 | 29 | 19 | 13 | 10 | 15 | 21 | 32 | 46 | 58 |	

Route taken: 0	3	6	9	14	20	30	38	48	55	62	67	72	76


class com.umich.tunisij.algorithms.GreedyBestFirstSearchAlgorithm
Tue Jan 22 18:32:17 EST 2019

|    |    |    |    |    |    |    |    |    |    |    |
|----|----|----|----|----|----|----|----|----|----|----|
| [] | [] | [] | [] | [] | [] | [] | [] | [] | [] | 30 |
| [] | [] | [] | [] | [] | [] | [] | [] | [] | 29 | 28 |
| [] | [] | [] | [] | ## | ## | ## | ## | [] | 27 | 26 |
| [] | [] | [] | [] | ## | 1  | 4  | ## | [] | 25 | 24 |
| [] | [] | [] | ## | ## | 0  | 2  | ## | [] | 23 | 22 |
| [] | [] | [] | [] | 5  | 3  | ## | ## | 14 | 17 | 20 |
| [] | [] | [] | [] | 7  | 6  | 8  | 10 | 12 | 15 | 18 |
| [] | [] | [] | [] | [] | 9  | 11 | 13 | 16 | 19 | 21 |	

Route taken: 0	3	6	8	10	12	15	18	20	22	24	26	28	30


class com.umich.tunisij.algorithms.AStarSearchAlgorithm
Tue Jan 22 18:32:17 EST 2019

|    |    |    |    |    |    |    |    |    |    |    |
|----|----|----|----|----|----|----|----|----|----|----|
| [] | [] | [] | [] | [] | [] | [] | 37 | 33 | 38 | 39 |
| [] | [] | [] | [] | [] | [] | [] | 32 | 31 | 34 | 36 |
| [] | [] | [] | [] | ## | ## | ## | ## | 26 | 29 | 35 |
| [] | [] | [] | [] | ## | 1  | 4  | ## | 22 | 27 | 30 |
| [] | [] | [] | ## | ## | 0  | 2  | ## | 18 | 23 | 28 |
| [] | [] | [] | 7  | 5  | 3  | ## | ## | 15 | 19 | 24 |
| [] | [] | [] | [] | 8  | 6  | 9  | 11 | 13 | 16 | 20 |
| [] | [] | [] | [] | [] | 10 | 12 | 14 | 17 | 21 | 25 |	

Route taken: 0	3	6	9	11	13	15	18	22	26	31	33	38	39


class com.umich.tunisij.algorithms.IterativeDeepeningSearchAlgorithm
Tue Jan 22 18:32:17 EST 2019

|    |    |    |    |    |    |    |    |    |    |    |
|----|----|----|----|----|----|----|----|----|----|----|
| 24 | 26 | 27 | [] | [] | [] | 62 | 60 | 57 | 63 | 64 |
| 22 | 25 | 28 | 29 | [] | 61 | 59 | 56 | 54 | 58 | [] |
| 20 | 23 | 30 | 33 | ## | ## | ## | ## | 52 | 55 | [] |
| 19 | 21 | 31 | 32 | ## | 1  | 4  | ## | 50 | 53 | [] |
| 17 | 15 | 12 | ## | ## | 0  | 2  | ## | 48 | 51 | [] |
| 14 | 11 | 9  | 7  | 5  | 3  | ## | ## | 45 | 49 | [] |
| 18 | 16 | 13 | 10 | 8  | 6  | 40 | 41 | 43 | 46 | [] |
| 34 | 35 | 36 | 37 | 38 | 39 | 42 | 44 | 47 | [] | [] |

Route taken: 0	3	6	40	41	43	45	48	50	52	54	57	63	64
