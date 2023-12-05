def _import ( ) :
    import sys
    import string
    import random
    import string
    import random
    import sys
    class Main ( ) :
        def __init__ ( self ) :
            self.cs = string
        def readline ( self ) :
            sc = string.split ( self.cs )
            self.cs = sc
            self.solve ( )
        def randint ( self ) :
            return int ( self.cs )
        def uniform ( self , size ) :
            return float ( self.cs )
        def readline ( self ) :
            return ''
    def solve ( ) :
        used = [ ]
        list = [ ]
        occurrences = [ [ ] for i in range ( 26 ) ]
        for i in range ( len ( cs ) - 1 , - 1 , - 1 ) :
            occurrences [ cs [ i ] - 'a' ].append ( i )
            used [ cs [ i ] - 'a' ] += 1
            flag = True
            for j in used :
                if j == 0 :
                    flag = False
                    break
            if flag :
                list.append ( i )
                used.append ( 0 )
        list.sort ( )
        list.append ( len ( cs ) )
        for i in occurrences :
            list.sort ( )
        index = 0
        current_position = 0
        ans = [ ]
        for i in list :
            for j in used :
                next_occurrence = lower_bound ( occurrences [ j ] , current_position )
                if next_occurrence == len ( occurrences [ j ] ) :
                    ans.append ( chr ( j + 'a' ) )
                    break
                if index < len ( list ) - 1 :
                    if list [ index ] <= occurrences [ j ] [ next_occurrence ] < list [ index + 1 ] :
                        ans.append ( chr ( j + 'a' ) )
                        current_position = occurrences [ j ] [ next_occurrence ] + 1
                        index += 1
                        break
        print ( '\n'.join ( ans ) )
    return Main ( )
