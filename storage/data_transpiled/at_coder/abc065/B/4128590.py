def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
    def __getitem__ ( self , key ) :
        return self.N
    def __setitem__ ( self , key , value ) :
        self.map [ key ] = value
    def __getitem__ ( self , key ) :
        return self.map [ key ]
    count = 0
    index = 1
    while True :
        if index - 1 == 2 :
            count += 1
            print ( count )
            return
        else :
            count += 1
            index = index - 1
        if count > N :
            print ( - 1 )
            return
