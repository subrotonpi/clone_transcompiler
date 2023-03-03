def import _main
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.a , self.b = args
        print ( max ( max ( a - b + max ( 9 - a // 100 , b // 100 - 1 ) * 100 , a - b + max ( 9 - a % 100 // 10 , b % 100 // 10 ) * 10 ) , a - b + max ( 9 - a % 10 , b % 10 ) ) )
