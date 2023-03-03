def find_sum_of_digits ( n ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.conut = 0
            self.buf = [ ]
            self.flag = 0
            while n > 0 :
                self.buf.append ( n % 10 )
                n = n // 10
                self.conut += 1
            if self.buf [ 0 ] == self.buf [ 1 ] and self.buf [ 3 ] == self.buf [ 4 ] :
                if self.buf [ 0 ] == self.buf [ 4 ] :
                    flag = 1
            elif self.buf [ 0 ] == self.buf [ 4 ] and self.buf [ 1 ] == self.buf [ 3 ] :
                flag = 1
    def main ( ) :
        sc = sys.stdin
        A , B = map ( int , sc.readline ( ).split ( ) )
        conut = 0
        for i in range ( A , B + 1 ) :
            flag = find_sum_of_digits ( i )
            if flag == 1 :
                conut += 1
        sys.stdout.write ( conut )
    return Main ( )
