def main ( ) :
    import sys
    from math import sin , cos , pi
    from os.path import join , dirname , join
    from os import rename , getcwd
    from os.path import join , dirname , join
    a = join ( dirname ( abspath ( join ( dirname ( __file__ ) ) ) ) , 'a' )
    b = join ( dirname ( abspath ( join ( dirname ( abspath ( __file__ ) ) ) ) ) , 'b' )
    h = join ( dirname ( abspath ( join ( dirname ( abspath ( __file__ ) ) ) ) ) , 'h' )
    area = ( a + b ) * h / 2
    print ( area )
