def main ( ) :
    import sys
    from numpy.linalg import solve
    class Main ( object ) :
        def solve_b ( self ) :
            with open ( "a" , "r" ) as f :
                wk = [ x for x in f.readlines ( ) ]
                wk.sort ( )
                res = abs ( wk [ 0 ] - wk [ 1 ] ) + abs ( wk [ 1 ] - wk [ 2 ] )
                print ( res )
        def solve_b ( self ) :
            with open ( "b" , "r" ) as f :
                s = f.read ( )
                t = f.read ( )
                s = s + s
                print ( "Yes" if t in s else "No" )
        def solve_c ( self ) :
            with open ( "c" , "r" ) as f :
                num_n , num_k , num_s = f.read ( )
                print ( "" )
        def solve_d ( self ) :
            with open ( "d" , "r" ) as f :
                num_n , num_k , num_s = f.read ( )
                print ( "" )
