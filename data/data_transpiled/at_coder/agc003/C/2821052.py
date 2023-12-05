def import _main
class Main ( object ) :
    class Data :
        def __init__ ( self , id , value ) :
            self.id , self.value = id , value
    def main ( sc ) :
        n = sc.recv_lines ( )
        data = [ Data ( i , sc.recv_lines ( ) ) for i in range ( n ) ]
        data = sorted ( data , lambda d1 , d2 : d1.value - d2.value )
        cnt = 0
        for i in range ( n ) :
            cnt += abs ( ( data [ i ].id - i ) ) % 2
        print ( cnt / 2 )
    def main ( ) :
        with open ( '/proc/main.txt' , 'r' ) as f :
            return _main ( f )
