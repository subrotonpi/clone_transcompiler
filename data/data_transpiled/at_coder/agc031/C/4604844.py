def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.num = int ( sys.stdin.readline ( ).strip ( ) )
        self.first = int ( sys.stdin.readline ( ).strip ( ) )
        self.last = int ( sys.stdin.readline ( ).strip ( ) )
        self.bit = { }
        self.index = { }
        self.sum = 0
        for i in range ( num ) :
            self.bit [ i ] = ( self.first & ( 1 << i ) ) != ( self.last & ( 1 << i ) )
            self.sum += 1 if self.bit [ i ] else 0
            self.index [ self.sum - 1 if self.bit [ i ] else num - ( self.index [ i ] - 1 ) ] = i
        if self.sum % 2 == 0 :
            print ( "NO" )
        else :
            print ( "YES" )
            self.max = int ( sum )
            self.tmp = self.first
            self.change = { }
            print ( self.tmp , end = " " )
            for i in range ( 1 , self.max ) :
                crt_index = 0
                for crt_index in self.index [ crt_index ] :
                    if ( i & ( 1 << crt_index ) ) :
                        break
                crt_index = self.num - crt_index - 1
                if self.bit [ self.index [ crt_index ] ] and crt_index != 0 :
                    if crt_index % 2 == 0 :
                        if self.change [ crt_index ] < 2 :
                            self.change [ crt_index ] += 1
                            crt_index -= 1
                    else :
                        if self.change [ crt_index ] < 1 :
                            self.change [ crt_index ] += 1
                            crt_index += 1
                crt_digit = 1 << self.index [ crt_index ]
                self.tmp = ( tmp - crt_digit if self.crt_digit else tmp + crt_digit )
                print ( self.tmp , end = " " )
        print ( )
