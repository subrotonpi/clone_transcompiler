def import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        sc = _scanner ( )
        self.n = sc.scanner.next ( )
    def main ( ) :
        n = sc.scanner.next ( )
        ans = 1
        max = 0
        for i in range ( 2 , n + 1 ) :
            tmp = i
            tmp_count = 0
            while tmp % 2 == 0 :
                tmp /= 2
                tmp_count += 1
            if max < tmp_count :
                max = tmp_count
                ans = i
        print ( ans )
