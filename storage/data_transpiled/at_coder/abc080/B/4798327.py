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
        sum = find_sum_of_digits ( N )
        if N % sum == 0 :
            sys.stdout.write ( "Yes\n" )
        else :
            sys.stdout.write ( "No\n" )
