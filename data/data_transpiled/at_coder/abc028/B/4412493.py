def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a = sc.__next__ ( )
        nums = [ 0 ] * 6
        s = a.split ( )
        for i in s :
            nums [ i - 65 ] += 1
        print ( nums [ 0 ] , nums [ 1 ] , nums [ 2 ] , nums [ 3 ] , nums [ 4 ] , nums [ 5 ] )
