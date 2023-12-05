def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        M = sys.stdin.read ( )
    al = [ ]
    for i in range ( N ) :
        Ai , Bi = [ i for i in range ( N ) if i > 0 ]
        al.append ( [ Ai , Bi ] )
    al.sort ( key = lambda x : x [ 0 ] )
    shop = 0
    money = 0
    while True :
        stock , price = al [ shop ] [ 1 ] , al [ shop ] [ 0 ]
        if stock < M :
            money += price * stock
            M -= stock
            shop += 1
        else :
            money += price * M
            break
    print ( money )
