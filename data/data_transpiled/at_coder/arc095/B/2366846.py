def _solve_a ( ) :
    import os
    import random
    import sys
    import random
    import sys
    class Main ( object ) :
        def solve_b ( self ) :
            with open ( os.devnull , 8096 ) as sc :
                data = [ ]
                N = sc.read ( 8096 )
                sorted_list = sorted ( data )
                median = sorted_list [ N / 2 - 1 ]
                for i in sorted_list :
                    if i >= median :
                        print ( median_minus )
                    else :
                        print ( median )
        def solve_a ( self ) :
            with open ( os.devnull , 8096 ) as sc :
                data = [ ]
                for i in sc.read ( 8096 ) :
                    data.append ( i )
                sorted_list = sorted ( data )
                median = sorted_list [ N / 2 ]
                for i in sorted_list :
                    if i >= median :
                        print ( median_minus )
                    else :
                        print ( median )
    if len ( list ) == 1 :
        print ( '%s %s\n' % ( max , list [ 0 ] ) )
        return
    targets = [ max // 2 ]
    if max % 2 == 0 :
        targets.append ( targets [ 0 ] )
    else :
        targets.append ( targets [ 0 ] + 1 )
    binary_search = bisect.bisect_left ( list , targets [ 0 ] )
    binary_search2 = bisect.bisect_right ( list , targets [ 1 ] )
    if binary_search >= 0 :
        print ( '%s %s\n' % ( max , list [ binary_search ] ) )
        return
    if binary_search2 >= 0 :
        print ( '%s %s\n' % ( max , list [ binary_search2 ] ) )
        return
    a = list [ min ( abs ( binary_search + 1 ) , len ( list ) - 1 ) ]
    b = list [ min ( abs ( targets [ 0 ] - b ) , len ( list ) - 1 ) ]
    c = list [ min ( abs ( targets [ 1 ] - c ) , len ( list ) - 1 ) ]
    d = list [ min ( abs ( binary_search2 + 2 ) , len ( list ) - 1 ) ]