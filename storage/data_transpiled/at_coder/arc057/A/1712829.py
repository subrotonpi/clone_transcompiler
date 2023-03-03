def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
    A = sys.stdin.read ( )
    K = sys.stdin.read ( )
    M = 2000000000000L
    if K == 0 :
        print ( M - A )
        return
    sum = A
    index = - 1
    for i in range ( 1 , M ) :
        sum += 1 + K * sum
        if sum >= M :
            index = i
            break
    print ( index )
