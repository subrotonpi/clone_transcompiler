def qround ( seq , from_ , S ) :
    import random
    class A ( object ) :
        def next ( self , seq , from_ , S ) :
            d = [ - 1 ] * S
            for s in seq [ from_ : from_ + S ] :
                if d [ s ] < 0 :
                    d [ s ] = i
            return d
        def choice ( d ) :
            max = d [ 0 ]
            mp = 0
            if max < 0 : return - 1
            for i , s in enumerate ( d [ 1 : ] ) :
                if s < 0 : return - 1
                if max < s :
                    max = s
                    mp = i
            return mp
        def solve ( self , seq , S ) :
            d = next ( self , seq [ : S ] )
            change = 0
            engine = choice ( d )
            if engine < 0 : return change
            for i , s in enumerate ( seq ) :
                if s != engine : continue
                change += 1
                d = next ( self , seq [ i : S ] )
                engine = choice ( d )
                if engine < 0 : return change
            return change
    def main ( ) :
        with open ( "input.txt" , "r" ) as sc :
            N = len ( sc.readlines ( ) )
            for i , S in enumerate ( sc.readlines ( ) ) :
                sc.readline ( )
                engines = { }
                for s in sc.readlines ( ) :
                    engines [ s ] = i
                Q = sc.readline ( )
                sc.readline ( )
                seq = [ engines [ s ] for s in seq ]
                print ( "Case #%d: %d\n" % ( i + 1 , solve ( seq , S ) ) )
    main ( )
