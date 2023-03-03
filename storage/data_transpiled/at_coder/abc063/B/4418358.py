def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        po = [ 0 ] * 26
        str = sc.read ( )
        c = str.split ( )
        for i in c :
            po [ i - 'a' ] += 1
        b = True
        for i in po :
            if i > 1 :
                b = False
        print ( 'yes' if b else 'no' )
