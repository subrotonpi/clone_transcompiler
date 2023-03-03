def import _Scanner
class Main ( Scanner ) :
    def __init__ ( self ) :
        sc = Scanner ( )
        a = sc.next ( )
        boin = '[aeoiu]'
        a = re.sub ( boin , '' , a )
        print ( a )
        sys.stdout.flush ( )
        sc.close ( )
