def main ( ) :
    import os
    import sys
    from numpy.distutils.misc_util import get_system_encoding
    with open ( 'src/D-large.in' , 'r' ) as sc :
        output = ""
        t = sc.read ( )
        for i in range ( 1 , t + 1 ) :
            k , c , s = get_system_encoding ( )
            if s * c < k :
                output += "Case #{}: IMPOSSIBLE\n".format ( i )
                continue
            nums = [ ]
            for j in range ( s ) :
                if j * c >= k :
                    break
                next = 0
                mult = 1
                for m in range ( c ) :
                    if j * c + m >= k :
                        break
                    next += ( j * c + m ) * mult
                    mult *= k
                next += 1
                nums.append ( next )
            to_add = ""
            for j in nums :
                to_add += " " + str ( j )
            output += "Case #{}:{}\n".format ( i , to_add )
        f = open ( 'src/D-large.out' , 'w' , encoding = 'utf-8' )
        f.write ( output )
        f.close ( )
