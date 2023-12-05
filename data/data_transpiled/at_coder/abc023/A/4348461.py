def import _main
class Main ( object ) :
    def __init__ ( self ) :
        with open ( "po" ) as sc :
            po = sc.read ( )
    p = po.split ( "" , 1 )
    ans = 0
    for i in p :
        ans += int ( i )
    print ( ans )
