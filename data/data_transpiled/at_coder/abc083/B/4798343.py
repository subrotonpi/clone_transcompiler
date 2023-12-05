def import sys
class Main ( object ) :
    def find_sum_of_digits ( self , n ) :
        sum = 0
        while n > 0 :
            sum += n % 10
            n = n / 10
        return sum
    def main ( ) :
        sc = sys.stdin
        N = int ( sc.readline ( ) )
        A = int ( sc.readline ( ) )
        B = int ( sc.readline ( ) )
        total = 0
        for i in range ( 1 , N + 1 ) :
            sum = find_sum_of_digits ( i )
            if A <= sum <= B :
                total = total + i
        sys.stdout.write ( total )
