def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.__count = 0
    def __str__ ( self ) :
        return self.__count
    def __str__ ( self ) :
        return self.__count
    str_list = str.split ( '' )
    count = 0
    max = 0
    for i in range ( len ( str_list ) ) :
        if not ( str_list [ i ] == 'A' or str_list [ i ] == 'C' or str_list [ i ] == 'G' or str_list [ i ] == 'T' ) :
            continue
        count += 1
        if i != len ( str_list ) - 1 :
            for j in range ( i + 1 , len ( str_list ) ) :
                if not ( str_list [ j ] == 'A' or str_list [ j ] == 'C' or str_list [ j ] == 'G' or str_list [ j ] == 'T' ) :
                    break
                count += 1
        if max < count :
            max = count
        count = 0
    print ( max )
