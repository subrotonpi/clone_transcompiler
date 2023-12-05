def main ( ) :
    import Queue
    class B ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            self.num_cases = sc.randint ( 1 , 10 )
            for q in range ( self.num_cases ) :
                N = sc.randint ( 1 , 10 )
                self.bot = sc.randint ( 1 , 10 )
        def max_servings ( self , bot ) :
            return self.bot / ( self.num_cases )
        def min_servings ( self , bot ) :
            return self.bot / ( self.num_cases )
        def max_total ( self , num ) :
            return self.bot / ( self.num_cases )
        def min_servings ( self , bot ) :
            return self.bot / ( self.num_cases )
        def max_total ( self , num ) :
            return self.bot / ( self.num_cases )
        def min_servings ( self , num ) :
            return self.bot / ( self.num_cases )
        def max_servings ( self , num ) :
            return self.bot / ( self.num_cases )
        def max_servings ( self , num ) :
            return self.bot / ( self.num_cases )
    queues = [ Queue ( ) for _ in range ( self.num_cases ) ]
    count = 0
    outer :
        while True :
            next_vals = [ ]
            for _ in range ( self.num_cases ) :
                if not queues [ _ ] :
                    break outer
                else :
                    next_vals.append ( queues [ _ ] [ - 1 ] )
        min_servings = [ ]
        max_servings = [ ]
        ok = True
        for _ in range ( self.num_cases ) :
            if max_servings [ _ ] < self.max_min or self.max_servings [ _ ] <= 0 :
                queues [ _ ].pop ( )
                ok = False
        if not ok :
            continue
        max_min = [ ]
        for _ in range ( self.num_cases ) :
            max_min = max ( max_servings [ _ ] , self.num_cases )
        for _ in range ( self.num_cases ) :
            queues [ _ ].pop ( )
            