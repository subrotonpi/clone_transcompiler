def _ import _ , os , sys , imp , code , globals , locals , _ = None ) :
    from itertools import repeat , repeat
    from itertools import chain , repeat
    from itertools import chain , repeat
    from itertools import chain , repeat
    def go ( from_x , to_x , k ) :
        if from_x >= to_x :
            return
        if not y [ from_x ] :
            yield from to_x
            return
        for i in range ( from_x + 1 , to_x + 1 ) :
            try :
                s = next ( chain ( repeat , repeat ) )
            except StopIteration :
                pass
            else :
                return
        return
    def go ( from_x , to_x , k ) :
        while not y [ from_x ] or not y [ from_x ] :
            try :
                s = next ( chain ( repeat , repeat ) )
            except StopIteration :
                pass
            else :
                return
        return
    def solve ( ) :
        n = sys.maxsize
        next = [ i for i in range ( n - 1 ) if i > to_x ]
        for i in range ( n - 2 ) :
            for j in range ( i + 1 , n - 1 ) :
                if y [ i ] > j and y [ j ] > y [ i ] :
                    print ( "Impossible" )
                    return
        y = chain ( repeat , repeat )
        go ( 0 , n - 1 , 1 )
        min = sys.maxsize
        for i in range ( n - 1 ) :
            min = min ( min , y [ i ] )
        for i in range ( n ) :
            print ( "%d " % ( y [ i ] - min ) , end = '' )
        print ( )
    def main ( ) :
        import sys
        try :
            sys.stdout = open ( 'C-large.out' , 'w' )
        except IOError :
            pass
        tests = repeat ( )
        for i in range ( tests ) :
            print ( "Case #%d: " % ( i + 1 ) , end = '' )
            solve ( )
    return main
