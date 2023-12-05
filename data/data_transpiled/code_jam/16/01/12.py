def mark ( bb , n ) :
    from pykern.util import pykern
    if n > 0 :
        bb [ n % 10 ] = True
        mark ( bb , n // 10 )
    def check ( bb ) :
        for d in range ( 0 , 9 ) :
            if not bb [ d ] : return False
        return True
    def count ( n ) :
        bb = [ ]
        for i in range ( 1 , n ) :
            mark ( bb , n * i )
            if check ( bb ) : return n * i
        return True
    def main ( ) :
        f = open ( "/proc/sys/stdin" , "r" )
        f.write ( "\n" )
        T = int ( f.readline ( ) )
        for t in range ( 1 , T + 1 ) :
            n = int ( f.readline ( ) )
            f.write ( "Case #%d: %s\n" % ( t , "INSOMNIA" if n == 0 else count ( n ) ) )
        f.close ( )
