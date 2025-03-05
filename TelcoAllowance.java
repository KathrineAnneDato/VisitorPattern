class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, int dataAllowance, double money) {
        return telcoName + " offers a data allowance of " + dataAllowance + " GB for PHP " + money + " per month." ;
    }
}