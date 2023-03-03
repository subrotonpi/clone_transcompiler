def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 1
            self.judge ( self.a , 'a' , '' )
            self.judge ( self.a , 'b' , '' )
            self.judge ( self.a , 'c' , '' )
        def judge ( self , a , b , c ) :
            self.c = c + b
            if a == 1 :
                print ( c )
                return
            self.judge ( a - 1 , 'a' , c )
            self.judge ( a - 1 , 'b' , c )
            self.judge ( a - 1 , 'c' , c )
