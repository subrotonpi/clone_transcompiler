def main ( ) :
    import sys
    import os
    def solver1 ( N , edges ) :
        ans = 0
        for from_node in range ( N ) :
            for to_node in range ( from_node + 1 ) :
                if edges [ from_node ] == True :
                    return True
        for to_node in range ( N ) :
            if edges [ to_node ] == True :
                return True
        for to_node in range ( N ) :
            if edges [ to_node ] == True :
                return True
        for to_node in range ( N ) :
            if edges [ to_node ] == True :
                return True
        for to_node in range ( N ) :
            if edges [ to_node ] == True :
                return True
        for to_node in range ( N ) :
            if edges [ to_node ] == False :
                return True
        for to_node in range ( N ) :
            if edges [ to_node ] == True :
                return True
        for to_node in range ( N ) :
            if edges [ to_node ] == False :
                return True
        for to_node in range ( N ) :
            if edges [ to_node ] == True :
                return True
        for to_node in range ( N ) :
            if edges [ to_node ] == True :
                return True
        for to_node in range ( N ) :
            if edges [ to_node ] == True :
                return True
        for to_node in range ( N ) :
            if edges [ to_node ] == True :
                return True
        for to_node in range ( N ) :
            if edges [ to_node ] == True :
                return True
        for to_node in range ( N ) :
            if edges [ to_node ] == True :
                return True
        for to_node in range ( N ) :
            if edges [ to_node ] == True :
                return True
        for to_node in range ( N ) :
            if edges [ to_node ] == True :
                return True
        for to_node in range ( N ) :
            if edges [ to_node ] == True :
                return True
    return False
