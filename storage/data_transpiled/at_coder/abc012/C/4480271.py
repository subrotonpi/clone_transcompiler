def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.n = int ( self.sc )
    N = 2025 - self.n
    lst = [ ]
    for i in range ( 1 , 9 ) :
        for j in range ( i , 9 ) :
            if i * j == N and i == j :
                lst.append ( ( "%d x %d" % ( i , j ) , i ) )
            elif i * j == N :
                lst.append ( ( "%d x %d" % ( i , j ) , j ) )
                lst.append ( ( "%d x %d" % ( j , i ) , j ) )
    lst.sort ( )
    for x in lst :
        print ( x )
