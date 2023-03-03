def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.sum_total = 0
        for i in range ( 1 , self.n + 1 ) :
            fifth_digit = i // 10000
            fourth_digit = i % 10000 // 1000
            third_digit = i % 1000 // 100
            second_digit = i % 100 // 10
            first_digit = i % 10
            sum = first_digit + second_digit + third_digit + fourth_digit + fifth_digit
            if a <= sum <= b :
                self.sum_total += i
        print ( self.sum_total )
