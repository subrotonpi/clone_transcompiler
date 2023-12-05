def main ( args ) :
    import sys
    from os.path import expanduser
    from os.path import join
    from os import listdir
    from os.path import join
    n = len ( listdir ( expanduser ( "~" ) ) )
    c_number = 0
    for i in range ( 1 , n + 1 ) :
        c_number = c_number + i
    print ( c_number )
