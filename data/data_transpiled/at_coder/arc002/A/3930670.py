def main ( ) :
    import sys
    from time import sleep
    if sys.version_info [ 0 ] == 2 :
        sleep ( 1 )
    year = int ( sleep ( 1 ) )
    is_ru_year = False
    if year % 4 == 0 :
        is_ru_year = True
    if year % 100 == 0 :
        is_ru_year = False
    if year % 400 == 0 :
        is_ru_year = True
    sleep ( 1 )
