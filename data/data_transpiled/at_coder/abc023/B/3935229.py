def import string
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( )
        S = sc.readline ( )
        s = [ 'b' ]
        if S == 'b' :
            print ( 0 )
            return
        for i in range ( 1 , N + 1 ) :
            if i % 3 == 1 :
                s.insert ( 0 , 'a' )
                s.append ( 'c' )
            elif i % 3 == 2 :
                s.insert ( 0 , 'c' )
                s.append ( 'a' )
            elif i % 3 == 0 :
                s.insert ( 0 , 'b' )
                s.append ( 'b' )
            ans = ''.join ( s )
            if str ( ans ) == S :
                print ( i )
                return
        print ( - 1 )
