def import _main
class Main ( object ) :
    def __init__ ( self ) :
        with open ( 'train.txt' , 'r' ) as sc :
            train = min ( [ x for x in sc.readlines ( ) if x.strip ( ) ] )
            bus = min ( [ x for x in sc.readlines ( ) if x.strip ( ) ] )
        print ( train , bus )
