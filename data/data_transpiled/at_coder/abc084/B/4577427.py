def import re
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        a = sc.randint ( 1 , 100 )
        b = sc.randint ( 1 , 100 )
        s = sc.read ( )
        if re.match ( r'[0-9]{%d}-[0-9]{%d}' % ( a , b ) , s ) :
            print ( "Yes" )
        else :
            print ( "No" )
