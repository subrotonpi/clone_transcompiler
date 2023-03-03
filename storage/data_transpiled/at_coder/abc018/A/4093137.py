def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        arr = [ Point ( i , sc.__next__ ( ) ) for i in range ( 3 ) ]
        arr.sort ( key = lambda p1 : p2.score )
        for i in range ( 3 ) :
            arr [ i ].order = i + 1
        arr.sort ( key = lambda p1 : p1.id )
        for i in range ( 3 ) :
            print ( arr [ i ].order )
    class Point ( object ) :
        def __init__ ( self , id , score ) :
            self.id = id
            self.score = score
            self.order = 0
