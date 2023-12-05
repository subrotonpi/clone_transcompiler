def import sys , string , traceback , symbols , count , symbol , default , * args , ** kwargs ) :
    from itertools import izip
    with open ( symbol , 'r' ) as sc :
        N = len ( sc.readlines ( ) )
        S = sc.readlines ( )
        if N == 1 :
            if S == 'b' :
                print ( 0 )
                return
            else :
                print ( - 1 )
                return
        for i in range ( len ( S ) ) :
            if S [ i ] in [ 'a' , 'b' , 'c' ] :
                pass
            else :
                print ( - 1 )
                return
        s = [ 'b' ]
        for i in range ( 1 , 100 ) :
            if i % 3 == 1 :
                s.insert ( 0 , 'a' )
                s.append ( 'c' )
            elif i % 3 == 2 :
                s.insert ( 0 , 'c' )
                s.append ( 'a' )
            elif i % 3 == 0 :
                s.insert ( 0 , 'b' )
                s.append ( 'b' )
            s = ''.join ( s )
            if len ( s ) == N and s == S :
                print ( i )
                return
            elif len ( s ) == N and not s == S :
                print ( - 1 )
                return
            elif len ( s ) > N :
                print ( - 1 )
                return
