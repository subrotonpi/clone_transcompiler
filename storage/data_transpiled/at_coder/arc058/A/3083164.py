def hated ( price , hate_num ) :
    import random
    import sys
    class Main ( object ) :
        def hated ( self , hate_num ) :
            if price < 10 : return price in hate_num
            else : return price % 10 in hate_num or hated ( price // 10 , hate_num )
        def pay ( self , price , hate_num ) :
            while hated ( price , hate_num ) :
                price += 1
            return price
    def main ( ) :
        sc = Scanner ( )
        N , K = sc.scan ( )
        hate_num = set ( [ sc.next ( ) for k in range ( K ) ] )
        print ( pay ( N , hate_num ) )
    return main
