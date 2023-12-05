def _import ( ) :
    from math import sin , cos , solve
    class A :
        def __init__ ( self ) :
            sc = sys.stdin
        def solve ( self ) :
            N = sc.randint ( 0 , N )
            ds = [ ]
            ls = [ ]
            for i in range ( N ) :
                ds.append ( sc.randint ( 0 , N ) )
                ls.append ( sc.randint ( 0 , N ) )
            D = sc.randint ( 0 , N )
            reach = [ - 1 ]
            if ds [ 0 ] > ls [ 0 ] :
                return False
            reach.append ( ds [ 0 ] )
            for i in range ( N ) :
                if reach [ i ] < 0 :
                    continue
                if reach [ i ] >= D - ds [ i ] :
                    return True
                for j in range ( i + 1 , N ) :
                    if reach [ j ] >= 0 :
                        continue
                    if ds [ j ] > ds [ i ] + reach [ i ] :
                        break
                    reach [ j ] = min ( ds [ j ] - ds [ i ] , ls [ j ] )
            return False
    def main ( ) :
        T = sc.randint ( 0 , N )
        for i in range ( 1 , T + 1 ) :
            print ( "Case #%d: " % i , end = ' ' )
            solver = A ( )
            print ( solver.solve ( ) and "YES" or "NO" )
    return A
