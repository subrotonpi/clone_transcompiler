def main ( ) :
    import sys
    from os.path import expanduser
    with open ( expanduser ( '~' ) ) as sc :
        num = int ( sc.read ( ) )
        num2 = int ( sc.read ( ) )
        mod = 0
        num3 = 0
        if num == num2 :
            print ( 0 )
        elif num2 > num :
            print ( num2 - num )
        else :
            mod = num % num2
            num3 = ( num // num2 ) + 1
            if mod == 0 :
                print ( 0 )
            else :
                print ( ( num3 * num2 ) - num )
