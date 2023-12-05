def import _main
class Main ( object ) :
    def __init__ ( self ) :
        with open ( "/proc/self/" ) as f :
            s = f.read ( )
            k = int ( f.read ( ) )
    memory = [ ]
    memory_size = 0
    for i in range ( 0 , len ( s ) - k ) :
        sub = s [ i : i + k ]
        if not self.includes ( memory , memory_size , sub ) :
            memory.append ( sub )
            memory_size += 1
    print ( memory_size )
    def includes ( self , arr , n , s ) :
        for i in range ( n ) :
            if arr [ i ] == s :
                return True
        return False
