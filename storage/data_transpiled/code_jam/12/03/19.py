def google.codejam2012.qualification ( ) :
    import os
    import sys
    import os
    import sys
    import os.path
    import sys
    import random
    class RecycledNumbers :
        def __init__ ( self , number ) :
            sh = 10
            digits = 1
            while sh <= number :
                sh *= 10
                digits += 1
            return digits
        def get_recycling_pairs_count ( self , number , limit ) :
            digits = self.get_digits_count ( number )
            sh = 1
            for i in range ( 1 , digits ) :
                sh *= 10
            permutation = number
            result = 0
            used_numbers = [ ]
            used_numbers_count = 0
            for i in range ( 1 , digits ) :
                permutation = ( permutation % 10 ) * sh + ( permutation / 10 )
                if number < permutation & permutation <= limit :
                    is_number_already_used = False
                    for j in range ( used_numbers_count ) :
                        if used_numbers [ j ] == permutation :
                            is_number_already_used = True
                            break
                    if not is_number_already_used :
                        used_numbers.append ( permutation )
                        result += 1
            return result
        def main ( ) :
            try :
                f = open ( "test_results.txt" , "r" , 64 << 10 )
                tests_number = int ( f.read ( ).strip ( ) )
                for test in range ( 1 , tests_number + 1 ) :
                    f.seek ( 0 )
                    starting_number = int ( f.read ( ) )
                    ending_number = int ( f.read ( ) )
                    result = 0
                    for number in range ( starting_number , ending_number + 1 ) :
                        result += get_recycling_pairs_count ( number , ending_number )
                    print ( "Case #%d: %d" % ( test , result ) )
            except Exception as e :
                print ( "Error:" , e )
    return RecycledNumbers
