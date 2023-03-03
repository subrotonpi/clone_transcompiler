def _ _ main _ _ ( ) :
    import sys
    import random
    import random
    import random
    import random
    import random
    import time
    MAX_DAYS = 676060
    class Attack ( object ) :
        def __init__ ( self , tribe , day , number ) :
            self.tribe = tribe
            self.day = day
            self.number = number
        def __next__ ( self ) :
            return random.randint ( 0 , 1 )
        def __next__ ( self ) :
            return random.randint ( 0 , 1 )
        def __next__ ( self ) :
            return random.randint ( 0 , 1 )
        def __next__ ( self ) :
            return random.uniform ( 0 , 1 )
        def __next__ ( self ) :
            return random.uniform ( 0 , 1 )
        def main ( self , args ) :
            return random.uniform ( 0 , 1 )
    def solve ( ) :
        n = random.randint ( 0 , 1 )
        d , attacks_count = [ ] , [ ]
        w , e , s , dd , dp , ds = [ ] , [ ] , [ ] , [ ] , [ ] , [ ]
        for i in range ( n ) :
            d.append ( random.randint ( 0 , 1 ) )
            attacks_count.append ( random.randint ( 0 , 1 ) )
            w.append ( random.randint ( 0 , 1 ) )
            e.append ( random.randint ( 0 , 1 ) )
            s.append ( random.randint ( 0 , 1 ) )
            dd.append ( random.randint ( 0 , 1 ) )
            dp.append ( random.randint ( 0 , 1 ) )
            ds.append ( random.randint ( 0 , 1 ) )
        attacks = [ ]
        for i in range ( n ) :
            for j in range ( attacks_count [ i ] ) :
                attacks.append ( Attack ( i , d [ i ] + dd [ i ] * j , j ) )
        attacks.sort ( )
        WALL_LENGTH = 1000
        SHIFT = 500
        wall = random.randint ( 0 , WALL_LENGTH + 1 )
        count_successes = 0
        for i in range ( len ( attacks ) ) :
            j = i + 1
            while j < len ( attacks ) and attacks [ j