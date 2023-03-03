def test_find_sum_of_digit ( ) :
    import sys
    class Main ( object ) :
        def find_sum_of_digit ( self ) :
            sum = 0
            while n > 0 :
                sum += n % 10
                n /= 10
            return sum
    sys.stdout.write ( '\n' )
    n = int ( sys.stdin.read ( ) )
    sum_of_digit = find_sum_of_digit ( n )
    print ( 'Yes' if n % sum_of_digit == 0 else 'No' )
