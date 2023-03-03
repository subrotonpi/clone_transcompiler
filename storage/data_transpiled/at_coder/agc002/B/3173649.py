def __count ( x ) :
    import sys
    import os
    from itertools import count
    ans = 0
    for i in x :
        if i : ans += 1
    return ans
