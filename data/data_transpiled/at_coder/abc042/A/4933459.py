def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        data = sc.read ( ).split ( )
        five_count = 0
        seven_count = 0
        for val in data :
            if val == '5' :
                five_count += 1
            if val == '7' :
                seven_count += 1
        print ( ( 'YES' if five_count == 2 and seven_count == 1 else 'NO' ) )
