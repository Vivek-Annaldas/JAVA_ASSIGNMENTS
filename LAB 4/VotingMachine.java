public class VotingMachine {

    public void castVote(int age) throws MinorAgeException {
        if (age < 18) {
            throw new MinorAgeException("Voter is not eligible to vote.");
        } else {
            System.out.println("Vote cast successfully.");
        }
    }

    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();

        try {
            vm.castVote(16);  // age less than 18
        } catch (MinorAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
