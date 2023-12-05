def main ( ) :
    import os
    class Main ( object ) :
        def __init__ ( self ) :
            self.MAP_SIZE = 10
            self.LAND = 'o'
            self.SEA = 'x'
        def map_equals ( self , ma ) :
            with open ( self.MAP_SIZE , 'r' ) as sc :
                import re
                for i , j in enumerate ( sc.readlines ( ) ) :
                    if ma [ i ] != mb [ j ] :
                        return False
                for j , s in enumerate ( sc.readlines ( ) ) :
                    if ma [ i ] != mb [ j ] :
                        return False
            return True
    for i in range ( MAP_SIZE ) :
        for j in range ( MAP_SIZE ) :
            copy = map_deepcopy ( map )
            copy [ i ] [ j ] = LAND
            land = blank_map ( )
            update_map ( sx , sy , copy , land )
            if map_equals ( land , copy ) :
                print ( 'YES' )
                return False
    print ( 'NO' )
    os.remove ( self.MAP_SIZE )
