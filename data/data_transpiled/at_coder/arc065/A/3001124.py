def import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        x = sc.read ( ).split ( '\n' )
        try :
            for i in range ( len ( x ) - 1 , - 1 , - 1 ) :
                if i >= 6 :
                    if x [ i - 6 ] == 'd' and x [ i - 5 ] == 'r' and x [ i - 4 ] == 'e' and x [ i - 3 ] == 'a' and x [ i - 2 ] == 'm' and x [ i - 1 ] == 'e' and x [ i ] == 'r' :
                        i -= 6
                        continue
                if i >= 5 :
                    if x [ i - 5 ] == 'e' and x [ i - 4 ] == 'r' and x [ i - 3 ] == 'a' and x [ i - 2 ] == 's' and x [ i - 1 ] == 'e' and x [ i ] == 'r' :
                        i -= 5
                        continue
                if ( x [ i - 4 ] == 'd' and x [ i - 3 ] == 'r' and x [ i - 2 ] == 'e' and x [ i - 1 ] == 'a' and x [ i ] == 'm' ) or ( x [ i - 4 ] == 'e' and x [ i - 3 ] == 'r' and x [ i - 2 ] == 'a' and x [ i - 1 ] == 's' and x [ i ] == 'e' ) :
                    i -= 4
                else :
                    print ( 'NO' )
                    return
        except IndexError :
            print ( 'NO' )
            return
        print ( 'YES' )
