def import _Scanner
class Main ( Scanner ) :
    def __init__ ( self ) :
        sc = _Scanner ( )
        a = sc.next ( )
        c = None
        if '9' in a :
            c = 'Yes'
        else :
            c = 'No'
        print ( c )
        sys.stdout.flush ( )
        sc.close ( )
